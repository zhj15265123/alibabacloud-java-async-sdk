// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowSQLLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowSQLLogsResponseBody</p>
 */
public class DescribeSlowSQLLogsResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSlowSQLLogsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowSQLLogsResponseBody create() {
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

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSlowSQLLogsResponseBody build() {
            return new DescribeSlowSQLLogsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("DBRole")
        private String DBRole;

        @NameInMap("ExecuteCost")
        private Float executeCost;

        @NameInMap("ExecuteState")
        private String executeState;

        @NameInMap("OperationClass")
        private String operationClass;

        @NameInMap("OperationExecuteTime")
        private String operationExecuteTime;

        @NameInMap("OperationType")
        private String operationType;

        @NameInMap("QueryId")
        private String queryId;

        @NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @NameInMap("SQLPlan")
        private String SQLPlan;

        @NameInMap("SQLText")
        private String SQLText;

        @NameInMap("ScanRowCounts")
        private Long scanRowCounts;

        @NameInMap("SourceIP")
        private String sourceIP;

        @NameInMap("SourcePort")
        private Integer sourcePort;

        private Items(Builder builder) {
            this.accountName = builder.accountName;
            this.DBName = builder.DBName;
            this.DBRole = builder.DBRole;
            this.executeCost = builder.executeCost;
            this.executeState = builder.executeState;
            this.operationClass = builder.operationClass;
            this.operationExecuteTime = builder.operationExecuteTime;
            this.operationType = builder.operationType;
            this.queryId = builder.queryId;
            this.returnRowCounts = builder.returnRowCounts;
            this.SQLPlan = builder.SQLPlan;
            this.SQLText = builder.SQLText;
            this.scanRowCounts = builder.scanRowCounts;
            this.sourceIP = builder.sourceIP;
            this.sourcePort = builder.sourcePort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return DBRole
         */
        public String getDBRole() {
            return this.DBRole;
        }

        /**
         * @return executeCost
         */
        public Float getExecuteCost() {
            return this.executeCost;
        }

        /**
         * @return executeState
         */
        public String getExecuteState() {
            return this.executeState;
        }

        /**
         * @return operationClass
         */
        public String getOperationClass() {
            return this.operationClass;
        }

        /**
         * @return operationExecuteTime
         */
        public String getOperationExecuteTime() {
            return this.operationExecuteTime;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return queryId
         */
        public String getQueryId() {
            return this.queryId;
        }

        /**
         * @return returnRowCounts
         */
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        /**
         * @return SQLPlan
         */
        public String getSQLPlan() {
            return this.SQLPlan;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return scanRowCounts
         */
        public Long getScanRowCounts() {
            return this.scanRowCounts;
        }

        /**
         * @return sourceIP
         */
        public String getSourceIP() {
            return this.sourceIP;
        }

        /**
         * @return sourcePort
         */
        public Integer getSourcePort() {
            return this.sourcePort;
        }

        public static final class Builder {
            private String accountName; 
            private String DBName; 
            private String DBRole; 
            private Float executeCost; 
            private String executeState; 
            private String operationClass; 
            private String operationExecuteTime; 
            private String operationType; 
            private String queryId; 
            private Long returnRowCounts; 
            private String SQLPlan; 
            private String SQLText; 
            private Long scanRowCounts; 
            private String sourceIP; 
            private Integer sourcePort; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * DBRole.
             */
            public Builder DBRole(String DBRole) {
                this.DBRole = DBRole;
                return this;
            }

            /**
             * ExecuteCost.
             */
            public Builder executeCost(Float executeCost) {
                this.executeCost = executeCost;
                return this;
            }

            /**
             * ExecuteState.
             */
            public Builder executeState(String executeState) {
                this.executeState = executeState;
                return this;
            }

            /**
             * OperationClass.
             */
            public Builder operationClass(String operationClass) {
                this.operationClass = operationClass;
                return this;
            }

            /**
             * OperationExecuteTime.
             */
            public Builder operationExecuteTime(String operationExecuteTime) {
                this.operationExecuteTime = operationExecuteTime;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * QueryId.
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * ReturnRowCounts.
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * SQLPlan.
             */
            public Builder SQLPlan(String SQLPlan) {
                this.SQLPlan = SQLPlan;
                return this;
            }

            /**
             * SQLText.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * ScanRowCounts.
             */
            public Builder scanRowCounts(Long scanRowCounts) {
                this.scanRowCounts = scanRowCounts;
                return this;
            }

            /**
             * SourceIP.
             */
            public Builder sourceIP(String sourceIP) {
                this.sourceIP = sourceIP;
                return this;
            }

            /**
             * SourcePort.
             */
            public Builder sourcePort(Integer sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
