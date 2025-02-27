// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQualityRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQualityRulesResponseBody</p>
 */
public class ListQualityRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListQualityRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The list of monitoring rules.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to troubleshoot errors.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request is successful.
         * *   false: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListQualityRulesResponseBody build() {
            return new ListQualityRulesResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @NameInMap("BlockType")
        private Integer blockType;

        @NameInMap("CheckerId")
        private Integer checkerId;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CriticalThreshold")
        private String criticalThreshold;

        @NameInMap("EntityId")
        private Integer entityId;

        @NameInMap("ExpectValue")
        private String expectValue;

        @NameInMap("FixCheck")
        private Boolean fixCheck;

        @NameInMap("HistoryCriticalThreshold")
        private String historyCriticalThreshold;

        @NameInMap("HistoryWarningThreshold")
        private String historyWarningThreshold;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("MatchExpression")
        private String matchExpression;

        @NameInMap("MethodId")
        private Integer methodId;

        @NameInMap("MethodName")
        private String methodName;

        @NameInMap("OnDuty")
        private String onDuty;

        @NameInMap("OnDutyAccountName")
        private String onDutyAccountName;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("Property")
        private String property;

        @NameInMap("PropertyKey")
        private String propertyKey;

        @NameInMap("RuleCheckerRelationId")
        private Integer ruleCheckerRelationId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleType")
        private Integer ruleType;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TemplateId")
        private Integer templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("Trend")
        private String trend;

        @NameInMap("WarningThreshold")
        private String warningThreshold;

        private Rules(Builder builder) {
            this.blockType = builder.blockType;
            this.checkerId = builder.checkerId;
            this.comment = builder.comment;
            this.criticalThreshold = builder.criticalThreshold;
            this.entityId = builder.entityId;
            this.expectValue = builder.expectValue;
            this.fixCheck = builder.fixCheck;
            this.historyCriticalThreshold = builder.historyCriticalThreshold;
            this.historyWarningThreshold = builder.historyWarningThreshold;
            this.id = builder.id;
            this.matchExpression = builder.matchExpression;
            this.methodId = builder.methodId;
            this.methodName = builder.methodName;
            this.onDuty = builder.onDuty;
            this.onDutyAccountName = builder.onDutyAccountName;
            this.projectName = builder.projectName;
            this.property = builder.property;
            this.propertyKey = builder.propertyKey;
            this.ruleCheckerRelationId = builder.ruleCheckerRelationId;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
            this.tableName = builder.tableName;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.trend = builder.trend;
            this.warningThreshold = builder.warningThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return blockType
         */
        public Integer getBlockType() {
            return this.blockType;
        }

        /**
         * @return checkerId
         */
        public Integer getCheckerId() {
            return this.checkerId;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return criticalThreshold
         */
        public String getCriticalThreshold() {
            return this.criticalThreshold;
        }

        /**
         * @return entityId
         */
        public Integer getEntityId() {
            return this.entityId;
        }

        /**
         * @return expectValue
         */
        public String getExpectValue() {
            return this.expectValue;
        }

        /**
         * @return fixCheck
         */
        public Boolean getFixCheck() {
            return this.fixCheck;
        }

        /**
         * @return historyCriticalThreshold
         */
        public String getHistoryCriticalThreshold() {
            return this.historyCriticalThreshold;
        }

        /**
         * @return historyWarningThreshold
         */
        public String getHistoryWarningThreshold() {
            return this.historyWarningThreshold;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return matchExpression
         */
        public String getMatchExpression() {
            return this.matchExpression;
        }

        /**
         * @return methodId
         */
        public Integer getMethodId() {
            return this.methodId;
        }

        /**
         * @return methodName
         */
        public String getMethodName() {
            return this.methodName;
        }

        /**
         * @return onDuty
         */
        public String getOnDuty() {
            return this.onDuty;
        }

        /**
         * @return onDutyAccountName
         */
        public String getOnDutyAccountName() {
            return this.onDutyAccountName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return ruleCheckerRelationId
         */
        public Integer getRuleCheckerRelationId() {
            return this.ruleCheckerRelationId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleType
         */
        public Integer getRuleType() {
            return this.ruleType;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return templateId
         */
        public Integer getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return trend
         */
        public String getTrend() {
            return this.trend;
        }

        /**
         * @return warningThreshold
         */
        public String getWarningThreshold() {
            return this.warningThreshold;
        }

        public static final class Builder {
            private Integer blockType; 
            private Integer checkerId; 
            private String comment; 
            private String criticalThreshold; 
            private Integer entityId; 
            private String expectValue; 
            private Boolean fixCheck; 
            private String historyCriticalThreshold; 
            private String historyWarningThreshold; 
            private Integer id; 
            private String matchExpression; 
            private Integer methodId; 
            private String methodName; 
            private String onDuty; 
            private String onDutyAccountName; 
            private String projectName; 
            private String property; 
            private String propertyKey; 
            private Integer ruleCheckerRelationId; 
            private String ruleName; 
            private Integer ruleType; 
            private String tableName; 
            private Integer templateId; 
            private String templateName; 
            private String trend; 
            private String warningThreshold; 

            /**
             * The strength of the monitoring rule. The strength of a monitoring rule indicates the importance of the rule. Valid values:
             * <p>
             * 
             * *   1: The monitoring rule is a strong rule.
             * 
             * *   0: The monitoring rule is a weak rule.
             * 
             *     You can specify whether a monitoring rule is a strong rule based on your business requirements. If a strong rule is used and a critical alert is reported, nodes are blocked.
             */
            public Builder blockType(Integer blockType) {
                this.blockType = blockType;
                return this;
            }

            /**
             * The ID of the checker.
             */
            public Builder checkerId(Integer checkerId) {
                this.checkerId = checkerId;
                return this;
            }

            /**
             * The description of the monitoring rule.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The threshold for a critical alert. The threshold indicates the deviation of the monitoring result from the expected value. You can customize this threshold based on your business requirements. If a strong rule is used and a critical alert is reported, nodes are blocked.
             */
            public Builder criticalThreshold(String criticalThreshold) {
                this.criticalThreshold = criticalThreshold;
                return this;
            }

            /**
             * The ID of the partition filter expression.
             */
            public Builder entityId(Integer entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The expected value.
             */
            public Builder expectValue(String expectValue) {
                this.expectValue = expectValue;
                return this;
            }

            /**
             * Indicates whether the monitoring is performed based on a fixed value.
             */
            public Builder fixCheck(Boolean fixCheck) {
                this.fixCheck = fixCheck;
                return this;
            }

            /**
             * The historical threshold for a critical alert.
             */
            public Builder historyCriticalThreshold(String historyCriticalThreshold) {
                this.historyCriticalThreshold = historyCriticalThreshold;
                return this;
            }

            /**
             * The historical threshold for a warning alert.
             */
            public Builder historyWarningThreshold(String historyWarningThreshold) {
                this.historyWarningThreshold = historyWarningThreshold;
                return this;
            }

            /**
             * The ID of the monitoring rule.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The partition filter expression.
             */
            public Builder matchExpression(String matchExpression) {
                this.matchExpression = matchExpression;
                return this;
            }

            /**
             * The ID of the sampling method of the monitoring rule.
             */
            public Builder methodId(Integer methodId) {
                this.methodId = methodId;
                return this;
            }

            /**
             * The name of the method that is used to collect sample data, such as avg, count, sum, min, max, count_distinct, user_defined, table_count, table_size, table_dt_load_count, table_dt_refuseload_count, null_value, null_value/table_count, (table_count-count_distinct)/table_count, or table_count-count_distinct.
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to configure the monitoring rule.
             */
            public Builder onDuty(String onDuty) {
                this.onDuty = onDuty;
                return this;
            }

            /**
             * The name of the Alibaba Cloud account that is used to configure the monitoring rule.
             */
            public Builder onDutyAccountName(String onDutyAccountName) {
                this.onDutyAccountName = onDutyAccountName;
                return this;
            }

            /**
             * The name of the compute engine instance or data source.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * The name of the monitored field.
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * The field that is used to associate with monitoring rules at the frontend. This parameter can be ignored.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * The ID of the node that is associated with the partition filter expression.
             */
            public Builder ruleCheckerRelationId(Integer ruleCheckerRelationId) {
                this.ruleCheckerRelationId = ruleCheckerRelationId;
                return this;
            }

            /**
             * The name of the monitoring rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The type of the monitoring rule. Valid values:
             * <p>
             * 
             * *   0: The monitoring rule is created by the system.
             * *   1: The monitoring rule is created by a user.
             * *   2: The monitoring rule is a workspace-level rule.
             */
            public Builder ruleType(Integer ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The ID of the monitoring template.
             */
            public Builder templateId(Integer templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The name of the monitoring template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The trend of the monitoring results.
             */
            public Builder trend(String trend) {
                this.trend = trend;
                return this;
            }

            /**
             * The threshold for a warning alert. The threshold indicates the deviation of the monitoring result from the expected value. You can customize this threshold based on your business requirements.
             */
            public Builder warningThreshold(String warningThreshold) {
                this.warningThreshold = warningThreshold;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.rules = builder.rules;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Rules> rules; 
            private Long totalCount; 

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: 10. Maximum value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The details of the monitoring rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * The total number of returned entries.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
