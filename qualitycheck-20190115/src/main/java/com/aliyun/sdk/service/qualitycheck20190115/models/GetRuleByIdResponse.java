// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRuleByIdResponse} extends {@link TeaModel}
 *
 * <p>GetRuleByIdResponse</p>
 */
public class GetRuleByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRuleByIdResponseBody body;

    private GetRuleByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRuleByIdResponse create() {
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
    public GetRuleByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRuleByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRuleByIdResponseBody body);

        @Override
        GetRuleByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRuleByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRuleByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRuleByIdResponse response) {
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
        public Builder body(GetRuleByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRuleByIdResponse build() {
            return new GetRuleByIdResponse(this);
        } 

    } 

}
