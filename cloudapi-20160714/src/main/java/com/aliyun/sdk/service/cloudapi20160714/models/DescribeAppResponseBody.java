// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppResponseBody</p>
 */
public class DescribeAppResponseBody extends TeaModel {
    @NameInMap("AppId")
    private Long appId;

    @NameInMap("AppName")
    private String appName;

    @NameInMap("CreatedTime")
    private String createdTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("Extend")
    private String extend;

    @NameInMap("ModifiedTime")
    private String modifiedTime;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAppResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.extend = builder.extend;
        this.modifiedTime = builder.modifiedTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long appId; 
        private String appName; 
        private String createdTime; 
        private String description; 
        private String extend; 
        private String modifiedTime; 
        private String requestId; 

        /**
         * The ID of the app.
         */
        public Builder appId(Long appId) {
            this.appId = appId;
            return this;
        }

        /**
         * The name of the app.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * The time when the app was created.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The description of the app.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Extended Fields.
         */
        public Builder extend(String extend) {
            this.extend = extend;
            return this;
        }

        /**
         * The time when the app was modified.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppResponseBody build() {
            return new DescribeAppResponseBody(this);
        } 

    } 

}
