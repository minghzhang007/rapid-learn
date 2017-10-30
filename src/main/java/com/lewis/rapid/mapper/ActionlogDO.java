package com.lewis.rapid.mapper.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.ibatis.type.Alias;

/**
* @author:admin
* @version:1.0
* @since:1.0
* @createTime:2017-10-30 22:47:49
*/
@Alias("actionlog")
@Entity(name = "actionlog")
public class ActionlogDO implements java.io.Serializable{

private static final long serialVersionUID = 1L;

    /** 主键id */
private long id;

    /** 资源类型 */
private java.lang.String resourceType;

    /** 资源类型 */
private java.lang.String resourceId;

    /** 行为类型:10=客户端点击,11=wap点击,20=曝光,31=微信好友分享,32=朋友圈分享,33=微博分享,40=浏览,50=搜索.. */
private Integer actionType;

    /** 行为次数 */
private int actionCount;

    /** 行为持续时间(秒) */
private int actionDuration;

    /** 行为产生时间 */
private long actionTime;

    /** 产生行为的用户id */
private long userId;

    /** 相关内容 */
private java.lang.String relatedContent;

    /** 客户端平台 */
private java.lang.String clientPlatform;

    /** 客户端版本号 */
private java.lang.String clientVersion;

    /** 客户端渠道 */
private java.lang.String channelId;

    /** 记录创建时间 */
private long createTime;

public Actionlog(){
}

public void setId(long id) {
this.id = id;
}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "Id")
public long getId() {
return this.id;
}

public void setResourceType(java.lang.String resourceType) {
this.resourceType = resourceType;
}

@Column(name = "ResourceType")
public java.lang.String getResourceType() {
return this.resourceType;
}

public void setResourceId(java.lang.String resourceId) {
this.resourceId = resourceId;
}

@Column(name = "ResourceId")
public java.lang.String getResourceId() {
return this.resourceId;
}

public void setActionType(Integer actionType) {
this.actionType = actionType;
}

@Column(name = "ActionType")
public Integer getActionType() {
return this.actionType;
}

public void setActionCount(int actionCount) {
this.actionCount = actionCount;
}

@Column(name = "ActionCount")
public int getActionCount() {
return this.actionCount;
}

public void setActionDuration(int actionDuration) {
this.actionDuration = actionDuration;
}

@Column(name = "ActionDuration")
public int getActionDuration() {
return this.actionDuration;
}

public void setActionTime(long actionTime) {
this.actionTime = actionTime;
}

@Column(name = "ActionTime")
public long getActionTime() {
return this.actionTime;
}

public void setUserId(long userId) {
this.userId = userId;
}

@Column(name = "UserId")
public long getUserId() {
return this.userId;
}

public void setRelatedContent(java.lang.String relatedContent) {
this.relatedContent = relatedContent;
}

@Column(name = "RelatedContent")
public java.lang.String getRelatedContent() {
return this.relatedContent;
}

public void setClientPlatform(java.lang.String clientPlatform) {
this.clientPlatform = clientPlatform;
}

@Column(name = "ClientPlatform")
public java.lang.String getClientPlatform() {
return this.clientPlatform;
}

public void setClientVersion(java.lang.String clientVersion) {
this.clientVersion = clientVersion;
}

@Column(name = "ClientVersion")
public java.lang.String getClientVersion() {
return this.clientVersion;
}

public void setChannelId(java.lang.String channelId) {
this.channelId = channelId;
}

@Column(name = "ChannelId")
public java.lang.String getChannelId() {
return this.channelId;
}

public void setCreateTime(long createTime) {
this.createTime = createTime;
}

@Column(name = "CreateTime")
public long getCreateTime() {
return this.createTime;
}

}