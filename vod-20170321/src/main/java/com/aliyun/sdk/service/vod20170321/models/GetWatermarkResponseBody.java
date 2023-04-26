// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWatermarkResponseBody} extends {@link TeaModel}
 *
 * <p>GetWatermarkResponseBody</p>
 */
public class GetWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WatermarkInfo")
    private WatermarkInfo watermarkInfo;

    private GetWatermarkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.watermarkInfo = builder.watermarkInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWatermarkResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return watermarkInfo
     */
    public WatermarkInfo getWatermarkInfo() {
        return this.watermarkInfo;
    }

    public static final class Builder {
        private String requestId; 
        private WatermarkInfo watermarkInfo; 

        /**
         * The time when the watermark was added. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the application.
         */
        public Builder watermarkInfo(WatermarkInfo watermarkInfo) {
            this.watermarkInfo = watermarkInfo;
            return this;
        }

        public GetWatermarkResponseBody build() {
            return new GetWatermarkResponseBody(this);
        } 

    } 

    public static class WatermarkInfo extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("IsDefault")
        private String isDefault;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("WatermarkConfig")
        private String watermarkConfig;

        @NameInMap("WatermarkId")
        private String watermarkId;

        private WatermarkInfo(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.fileUrl = builder.fileUrl;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.type = builder.type;
            this.watermarkConfig = builder.watermarkConfig;
            this.watermarkId = builder.watermarkId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WatermarkInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return watermarkConfig
         */
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        /**
         * @return watermarkId
         */
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String fileUrl; 
            private String isDefault; 
            private String name; 
            private String type; 
            private String watermarkConfig; 
            private String watermarkId; 

            /**
             * The ID of the watermark.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the watermark.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to **GetWatermark**.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The Object Storage Service (OSS) URL or Content Delivery Network (CDN) URL of the watermark file. A text watermark does not have a file URL.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Queries a single watermark.
             */
            public Builder watermarkConfig(String watermarkConfig) {
                this.watermarkConfig = watermarkConfig;
                return this;
            }

            /**
             * WatermarkId.
             */
            public Builder watermarkId(String watermarkId) {
                this.watermarkId = watermarkId;
                return this;
            }

            public WatermarkInfo build() {
                return new WatermarkInfo(this);
            } 

        } 

    }
}
