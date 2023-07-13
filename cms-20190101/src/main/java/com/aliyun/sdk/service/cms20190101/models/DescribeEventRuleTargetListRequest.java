// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventRuleTargetListRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventRuleTargetListRequest</p>
 */
public class DescribeEventRuleTargetListRequest extends Request {
    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    private DescribeEventRuleTargetListRequest(Builder builder) {
        super(builder);
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventRuleTargetListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<DescribeEventRuleTargetListRequest, Builder> {
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventRuleTargetListRequest request) {
            super(request);
            this.ruleName = request.ruleName;
        } 

        /**
         * The name of the alert group.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public DescribeEventRuleTargetListRequest build() {
            return new DescribeEventRuleTargetListRequest(this);
        } 

    } 

}
