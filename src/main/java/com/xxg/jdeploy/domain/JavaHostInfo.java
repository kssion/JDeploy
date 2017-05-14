package com.xxg.jdeploy.domain;

/**
 * 主机对象
 * Created by Chance on 2017/5/13.
 */
public class JavaHostInfo {
    private String hostId;
    private String name;
    private String path;

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
