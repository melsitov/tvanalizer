package com.tvanalizer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.TimeZone;

@Entity
@Table(name = "tv_log")
public class TvLog {

    @Id
    @Column(name = "log_id")
    private Long id;

    @Column(name = "cusref")
    private Long cusRef;

    @Column(name = "devref")
    private Long devRef;

    @Column(name = "devmodel")
    private String devModel;

    @Column(name = "timezone")
    private TimeZone timeZone;

    @Column(name = "ref")
    private String ref;

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "end_time")
    private Long endTime;

    @Column(name = "duration")
    private Long duration;

    @Column(name = "date_part")
    private Long datePart;

    @Column(name = "extra")
    private String extra;

    @Column(name = "channelref")
    private Long channelRef;

    @Column(name = "channelname")
    private String channelName;

    @Column(name = "broadcastid")
    private Long broadcastId;

    @Column(name = "start_time")
    private Long startTime;

    @Column(name = "devtype")
    private String devtype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCusRef() {
        return cusRef;
    }

    public void setCusRef(Long cusRef) {
        this.cusRef = cusRef;
    }

    public Long getDevRef() {
        return devRef;
    }

    public void setDevRef(Long devRef) {
        this.devRef = devRef;
    }

    public String getDevModel() {
        return devModel;
    }

    public void setDevModel(String devModel) {
        this.devModel = devModel;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getDatePart() {
        return datePart;
    }

    public void setDatePart(Long datePart) {
        this.datePart = datePart;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Long getChannelRef() {
        return channelRef;
    }

    public void setChannelRef(Long channelRef) {
        this.channelRef = channelRef;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Long getBroadcastId() {
        return broadcastId;
    }

    public void setBroadcastId(Long broadcastId) {
        this.broadcastId = broadcastId;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public String getDevtype() {
        return devtype;
    }

    public void setDevtype(String devtype) {
        this.devtype = devtype;
    }
}
