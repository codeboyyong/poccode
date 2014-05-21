package com.codeboyyong.akkasample.server;

import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.japi.Creator;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * User: John Zhao
 * Date: 5/20/14
 * Time: 9:07 PM
 */
public class JavaServerMain {
    public static void main(String[] args) {
//        Map<String, Object> configureMap = new HashMap<String, Object>() {
//            {
//                put("akka.actor.provider","akka.remote.RemoteActorRefProvider");
//
//
//                put("akka.actor.deployment./mypath.remote",
//                        "akka.tcp://myRemoteActorSystem@127.0.0.1:2553");
//
//                put("akka.remote.enabled-transports", Arrays.asList(new String[]{"akka.remote.netty.tcp"}) );
//                put("akka.remote.netty.tcp.port", 2553);
//                put("akka.remote.netty.tcp.hostname", "127.0.0.1");
//
//
//            }
//        };
//
// 			Config akkaConfig = ConfigFactory.parseMap(configureMap);
//
//        ActorSystem actorSystem = ActorSystem.create("myRemoteActorSystem", akkaConfig);


      //  actorSystem.actorOf(Props.create(new EngineActorCreator()), "myRemoteActor");


    }
    static class EngineActorCreator implements Creator<MyRemoteActor> {
        @Override
        public MyRemoteActor create() throws Exception {
            return new MyRemoteActor();
        }
    }

}
