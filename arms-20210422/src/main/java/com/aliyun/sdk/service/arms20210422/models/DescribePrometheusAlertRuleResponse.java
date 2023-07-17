// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrometheusAlertRuleResponse} extends {@link TeaModel}
 *
 * <p>DescribePrometheusAlertRuleResponse</p>
 */
public class DescribePrometheusAlertRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePrometheusAlertRuleResponseBody body;

    private DescribePrometheusAlertRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePrometheusAlertRuleResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public DescribePrometheusAlertRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePrometheusAlertRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePrometheusAlertRuleResponseBody body);

        @Override
        DescribePrometheusAlertRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePrometheusAlertRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePrometheusAlertRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePrometheusAlertRuleResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribePrometheusAlertRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePrometheusAlertRuleResponse build() {
            return new DescribePrometheusAlertRuleResponse(this);
        } 

    } 

}
