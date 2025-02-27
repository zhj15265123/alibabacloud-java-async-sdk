// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineStrategyRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageBaselineStrategyRequest</p>
 */
public class DescribeImageBaselineStrategyRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("StrategyId")
    private Long strategyId;

    private DescribeImageBaselineStrategyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.source = builder.source;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBaselineStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<DescribeImageBaselineStrategyRequest, Builder> {
        private String lang; 
        private String source; 
        private Long strategyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageBaselineStrategyRequest request) {
            super(request);
            this.lang = request.lang;
            this.source = request.source;
            this.strategyId = request.strategyId;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The ID of the baseline check policy.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public DescribeImageBaselineStrategyRequest build() {
            return new DescribeImageBaselineStrategyRequest(this);
        } 

    } 

}
