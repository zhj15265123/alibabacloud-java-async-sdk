// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomEventCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomEventCountRequest</p>
 */
public class DescribeCustomEventCountRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("SearchKeywords")
    private String searchKeywords;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeCustomEventCountRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.eventId = builder.eventId;
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.searchKeywords = builder.searchKeywords;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomEventCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return searchKeywords
     */
    public String getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeCustomEventCountRequest, Builder> {
        private String endTime; 
        private String eventId; 
        private String groupId; 
        private String name; 
        private String searchKeywords; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomEventCountRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.eventId = request.eventId;
            this.groupId = request.groupId;
            this.name = request.name;
            this.searchKeywords = request.searchKeywords;
            this.startTime = request.startTime;
        } 

        /**
         * The returned message. If the call was successful, the value success is returned. If the call failed, an error message is returned.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The keywords that are contained in the content of the custom event to query. You can use a logical operator between keywords.
         * <p>
         * 
         * *   If you need to query the custom event whose content contains a and b, set the value to a and b.
         * *   If you need to query the custom event whose content contains a or b, set the value to a or b.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The end of the time range to query.
         * <p>
         * 
         * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder searchKeywords(String searchKeywords) {
            this.putQueryParameter("SearchKeywords", searchKeywords);
            this.searchKeywords = searchKeywords;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeCustomEventCountRequest build() {
            return new DescribeCustomEventCountRequest(this);
        } 

    } 

}
