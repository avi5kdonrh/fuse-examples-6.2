/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jboss.fuse.samples.server;

import java.net.URL;
import javax.xml.ws.Endpoint;


import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.bus.spring.SpringBusFactory;

import org.jboss.fuse.samples.impl.ReportIncidentEndpointImpl;

public class IncidentServer {

    protected IncidentServer() throws Exception {
        System.out.println("Starting Server");

        SpringBusFactory bf = new SpringBusFactory();
        URL busFile = IncidentServer.class.getResource("/META-INF/spring/context.xml");
        Bus bus = bf.createBus(busFile.toString());
        BusFactory.setDefaultBus(bus);

        Object implementor = new ReportIncidentEndpointImpl();
        String address = "https://0.0.0.0:9001/incident";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws Exception {
        System.out.println("The server's security configuration will be taken "
                           + "from server.xml using the bean name : "
                           + "\"{http://apache.org/hello_world_soap_http}"
                           + "GreeterImplPort.http-destination\".");
        System.out.println();
        new IncidentServer();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
