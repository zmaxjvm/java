package com.zmax.quartz.cache;

import com.hazelcast.config.Config;
import com.hazelcast.config.GroupConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.ITopic;
import com.zmax.quartz.dto.StrDTO;

/**
 * Created by zmax.
 */
public class CacheHazelcast {
    //TODO move to the common properties
    public static final String JOB_NODE_GROUP_NAME = "QuantStore-web-node";
    public static final String JOB_NODE_GROUP_PASS = "web_test_password";

    public static final String COMMON_NODE_GROUP_NAME = "common-node";
    public static final String COMMON_NODE_GROUP_PASS = "common_test_password";

    private static GroupConfig gcfHz = new GroupConfig().setName(JOB_NODE_GROUP_NAME).setPassword(JOB_NODE_GROUP_PASS);
    private static GroupConfig gcfHzCommon = new GroupConfig().setName(COMMON_NODE_GROUP_NAME).setPassword(COMMON_NODE_GROUP_PASS);
    public static HazelcastInstance HZ = Hazelcast.newHazelcastInstance(new Config().setGroupConfig(gcfHz));
    public static HazelcastInstance HZ_COMMON = Hazelcast.newHazelcastInstance(new Config().setGroupConfig(gcfHzCommon));


    public static ITopic<StrDTO> TOPIC = CacheHazelcast.HZ_COMMON.getTopic("default");


}
