// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectionTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectionTicketResponseBody</p>
 */
public class GetConnectionTicketResponseBody extends TeaModel {
    @NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @NameInMap("AppInstanceId")
    private String appInstanceId;

    @NameInMap("BizRegionId")
    private String bizRegionId;

    @NameInMap("OsType")
    private String osType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskStatus")
    private String taskStatus;

    @NameInMap("Ticket")
    private String ticket;

    private GetConnectionTicketResponseBody(Builder builder) {
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceId = builder.appInstanceId;
        this.bizRegionId = builder.bizRegionId;
        this.osType = builder.osType;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionTicketResponseBody create() {
        return builder().build();
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    public static final class Builder {
        private String appInstanceGroupId; 
        private String appInstanceId; 
        private String bizRegionId; 
        private String osType; 
        private String requestId; 
        private String taskId; 
        private String taskStatus; 
        private String ticket; 

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.osType = osType;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * Ticket.
         */
        public Builder ticket(String ticket) {
            this.ticket = ticket;
            return this;
        }

        public GetConnectionTicketResponseBody build() {
            return new GetConnectionTicketResponseBody(this);
        } 

    } 

}
