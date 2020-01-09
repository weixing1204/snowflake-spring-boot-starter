package com.weixing.snowflake.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.weixing.snowflake.util.SnowflakeUtils.SNOWFLAKE_PREFIX;

/**
 * 雪花算法的参数
 *
 * @author weixing
 * @date 2019.12.26
 */
@ConfigurationProperties(SNOWFLAKE_PREFIX)
public class SnowflakeConfigurationProperties {

    //工作ID
    private long worker = 0;
    //数据中心ID
    private long datacenter = 0;

    public long getWorker() {
        return worker;
    }

    public void setWorker(long worker) {
        this.worker = worker;
    }

    public long getDatacenter() {
        return datacenter;
    }

    public void setDatacenter(long datacenter) {
        this.datacenter = datacenter;
    }
}
