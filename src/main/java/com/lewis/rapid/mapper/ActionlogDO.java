package com.lewis.rapid.mapper;


import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:zhangminghua
 * @version:1.0
 * @since:1.0
 * @createTime:2017-10-31 19:03:37
 */
@Data
@NoArgsConstructor
public class ActionlogDO implements java.io.Serializable {


    /**
     * 主键id  db_column: Id
     */
    private Long id;

    /**
     * 资源类型  db_column: ResourceType
     */
    private String resourceType;

    /**
     * 资源类型  db_column: ResourceId
     */
    private String resourceId;

    /**
     * 行为类型:10=客户端点击,11=wap点击,20=曝光,31=微信好友分享,32=朋友圈分享,33=微博分享,40=浏览,50=搜索..  db_column: ActionType
     */
    private Integer actionType;

    /**
     * 行为次数  db_column: ActionCount
     */
    private Integer actionCount;

    /**
     * 行为持续时间(秒)  db_column: ActionDuration
     */
    private Integer actionDuration;

    /**
     * 行为产生时间  db_column: ActionTime
     */
    private Long actionTime;

    /**
     * 产生行为的用户id  db_column: UserId
     */
    private Long userId;

    /**
     * 相关内容  db_column: RelatedContent
     */
    private String relatedContent;

    /**
     * 客户端平台  db_column: ClientPlatform
     */
    private String clientPlatform;

    /**
     * 客户端版本号  db_column: ClientVersion
     */
    private String clientVersion;

    /**
     * 客户端渠道  db_column: ChannelId
     */
    private String channelId;

    /**
     * 记录创建时间  db_column: CreateTime
     */
    private Long createTime;


}