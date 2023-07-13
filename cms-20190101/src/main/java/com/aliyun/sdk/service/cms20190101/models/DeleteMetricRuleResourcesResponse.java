// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetricRuleResourcesResponse} extends {@link TeaModel}
 *
 * <p>DeleteMetricRuleResourcesResponse</p>
 */
public class DeleteMetricRuleResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMetricRuleResourcesResponseBody body;

    private DeleteMetricRuleResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMetricRuleResourcesResponse create() {
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
    public DeleteMetricRuleResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMetricRuleResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMetricRuleResourcesResponseBody body);

        @Override
        DeleteMetricRuleResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMetricRuleResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMetricRuleResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMetricRuleResourcesResponse response) {
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
        public Builder body(DeleteMetricRuleResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMetricRuleResourcesResponse build() {
            return new DeleteMetricRuleResourcesResponse(this);
        } 

    } 

}
