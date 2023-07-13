// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutCustomEventRuleRequest} extends {@link RequestModel}
 *
 * <p>PutCustomEventRuleRequest</p>
 */
public class PutCustomEventRuleRequest extends Request {
    @Query
    @NameInMap("ContactGroups")
    @Validation(required = true)
    private String contactGroups;

    @Query
    @NameInMap("EffectiveInterval")
    private String effectiveInterval;

    @Query
    @NameInMap("EmailSubject")
    private String emailSubject;

    @Query
    @NameInMap("EventName")
    @Validation(required = true)
    private String eventName;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("Level")
    @Validation(required = true)
    private String level;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("Threshold")
    @Validation(required = true)
    private String threshold;

    @Query
    @NameInMap("Webhook")
    private String webhook;

    private PutCustomEventRuleRequest(Builder builder) {
        super(builder);
        this.contactGroups = builder.contactGroups;
        this.effectiveInterval = builder.effectiveInterval;
        this.emailSubject = builder.emailSubject;
        this.eventName = builder.eventName;
        this.groupId = builder.groupId;
        this.level = builder.level;
        this.period = builder.period;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.threshold = builder.threshold;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutCustomEventRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroups
     */
    public String getContactGroups() {
        return this.contactGroups;
    }

    /**
     * @return effectiveInterval
     */
    public String getEffectiveInterval() {
        return this.effectiveInterval;
    }

    /**
     * @return emailSubject
     */
    public String getEmailSubject() {
        return this.emailSubject;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return threshold
     */
    public String getThreshold() {
        return this.threshold;
    }

    /**
     * @return webhook
     */
    public String getWebhook() {
        return this.webhook;
    }

    public static final class Builder extends Request.Builder<PutCustomEventRuleRequest, Builder> {
        private String contactGroups; 
        private String effectiveInterval; 
        private String emailSubject; 
        private String eventName; 
        private String groupId; 
        private String level; 
        private String period; 
        private String ruleId; 
        private String ruleName; 
        private String threshold; 
        private String webhook; 

        private Builder() {
            super();
        } 

        private Builder(PutCustomEventRuleRequest request) {
            super(request);
            this.contactGroups = request.contactGroups;
            this.effectiveInterval = request.effectiveInterval;
            this.emailSubject = request.emailSubject;
            this.eventName = request.eventName;
            this.groupId = request.groupId;
            this.level = request.level;
            this.period = request.period;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.threshold = request.threshold;
            this.webhook = request.webhook;
        } 

        /**
         * The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
         */
        public Builder contactGroups(String contactGroups) {
            this.putQueryParameter("ContactGroups", contactGroups);
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * The cycle that is used to aggregate monitoring data of the custom event. Unit: seconds. Set the value to an integral multiple of 60. Default value: 300.
         */
        public Builder effectiveInterval(String effectiveInterval) {
            this.putQueryParameter("EffectiveInterval", effectiveInterval);
            this.effectiveInterval = effectiveInterval;
            return this;
        }

        /**
         * The alert threshold.
         */
        public Builder emailSubject(String emailSubject) {
            this.putQueryParameter("EmailSubject", emailSubject);
            this.emailSubject = emailSubject;
            return this;
        }

        /**
         * The alert contact group that receives alert notifications. Separate multiple contact groups with commas (,).
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * The ID of the alert rule.
         * <p>
         * 
         * >  You can specify an existing ID to modify the corresponding alert rule or specify a new ID to create an alert rule.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The value 200 indicates that the call was successful.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * The subject of the alert notification email.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The name of the alert rule.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The name of the custom event. For more information about how to obtain the event name, see [DescribeCustomEventAttribute](~~115262~~).
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The level of the alert. Valid values:
         * <p>
         * 
         * *   CRITICAL: critical issue
         * *   WARN: warning
         * *   INFO: information
         */
        public Builder threshold(String threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * The time period during which the alert rule is effective. Valid values: 00:00 to 23:59.
         */
        public Builder webhook(String webhook) {
            this.putQueryParameter("Webhook", webhook);
            this.webhook = webhook;
            return this;
        }

        @Override
        public PutCustomEventRuleRequest build() {
            return new PutCustomEventRuleRequest(this);
        } 

    } 

}
