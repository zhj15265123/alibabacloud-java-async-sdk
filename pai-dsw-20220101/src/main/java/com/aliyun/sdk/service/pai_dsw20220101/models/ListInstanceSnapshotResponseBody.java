// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceSnapshotResponseBody</p>
 */
public class ListInstanceSnapshotResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Snapshots")
    private java.util.List < Snapshots> snapshots;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListInstanceSnapshotResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.snapshots = builder.snapshots;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceSnapshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshots
     */
    public java.util.List < Snapshots> getSnapshots() {
        return this.snapshots;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private java.util.List < Snapshots> snapshots; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Snapshots.
         */
        public Builder snapshots(java.util.List < Snapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstanceSnapshotResponseBody build() {
            return new ListInstanceSnapshotResponseBody(this);
        } 

    } 

    public static class Labels extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    public static class Snapshots extends TeaModel {
        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Labels")
        private java.util.List < Labels> labels;

        @NameInMap("ReasonCode")
        private String reasonCode;

        @NameInMap("ReasonMessage")
        private String reasonMessage;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("SnapshotName")
        private String snapshotName;

        @NameInMap("Status")
        private String status;

        private Snapshots(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.imageId = builder.imageId;
            this.imageUrl = builder.imageUrl;
            this.instanceId = builder.instanceId;
            this.labels = builder.labels;
            this.reasonCode = builder.reasonCode;
            this.reasonMessage = builder.reasonMessage;
            this.snapshotId = builder.snapshotId;
            this.snapshotName = builder.snapshotName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonMessage
         */
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return snapshotName
         */
        public String getSnapshotName() {
            return this.snapshotName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String imageId; 
            private String imageUrl; 
            private String instanceId; 
            private java.util.List < Labels> labels; 
            private String reasonCode; 
            private String reasonMessage; 
            private String snapshotId; 
            private String snapshotName; 
            private String status; 

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * ReasonCode.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * ReasonMessage.
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * SnapshotId.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * SnapshotName.
             */
            public Builder snapshotName(String snapshotName) {
                this.snapshotName = snapshotName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
}
