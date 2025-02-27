// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpgradeMajorVersionPrecheckTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpgradeMajorVersionPrecheckTaskResponseBody</p>
 */
public class DescribeUpgradeMajorVersionPrecheckTaskResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeUpgradeMajorVersionPrecheckTaskResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpgradeMajorVersionPrecheckTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * An array that consists of the attributes in the upgrade check report.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries in the upgrade check report.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBody build() {
            return new DescribeUpgradeMajorVersionPrecheckTaskResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("CheckTime")
        private String checkTime;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("EffectiveTime")
        private String effectiveTime;

        @NameInMap("Result")
        private String result;

        @NameInMap("SourceMajorVersion")
        private String sourceMajorVersion;

        @NameInMap("TargetMajorVersion")
        private String targetMajorVersion;

        @NameInMap("TaskId")
        private Integer taskId;

        private Items(Builder builder) {
            this.checkTime = builder.checkTime;
            this.detail = builder.detail;
            this.effectiveTime = builder.effectiveTime;
            this.result = builder.result;
            this.sourceMajorVersion = builder.sourceMajorVersion;
            this.targetMajorVersion = builder.targetMajorVersion;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return checkTime
         */
        public String getCheckTime() {
            return this.checkTime;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return sourceMajorVersion
         */
        public String getSourceMajorVersion() {
            return this.sourceMajorVersion;
        }

        /**
         * @return targetMajorVersion
         */
        public String getTargetMajorVersion() {
            return this.targetMajorVersion;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String checkTime; 
            private String detail; 
            private String effectiveTime; 
            private String result; 
            private String sourceMajorVersion; 
            private String targetMajorVersion; 
            private Integer taskId; 

            /**
             * The time at which the upgrade check was performed.
             * <p>
             * 
             * The value of this parameter is a timestamp that follows the UNIX time format. Unit: milliseconds.
             */
            public Builder checkTime(String checkTime) {
                this.checkTime = checkTime;
                return this;
            }

            /**
             * The content of the upgrade check report.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The expiration time of the upgrade check report.
             * <p>
             * 
             * The value of this parameter is a timestamp that follows the UNIX time format. Unit: milliseconds.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * The result of the upgrade check.
             * <p>
             * 
             * Valid values:
             * 
             * *   Success
             * *   Fail
             * 
             * >  If the check result is **Fail**, you must check the value of the **Detail** parameter to obtain the information about the errors that occurred. After you handle the errors, you can try again. For more information about how to handle common errors, see [Introduction to the check report for a major engine version upgrade to an ApsaraDB RDS for PostgreSQL instance](~~218391~~).
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The original major engine version of the instance.
             */
            public Builder sourceMajorVersion(String sourceMajorVersion) {
                this.sourceMajorVersion = sourceMajorVersion;
                return this;
            }

            /**
             * The new major engine version of the instance.
             */
            public Builder targetMajorVersion(String targetMajorVersion) {
                this.targetMajorVersion = targetMajorVersion;
                return this;
            }

            /**
             * The ID of the upgrade check task.
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
