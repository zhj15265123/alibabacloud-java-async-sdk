// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPosChEcomResponse} extends {@link TeaModel}
 *
 * <p>GetPosChEcomResponse</p>
 */
public class GetPosChEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPosChEcomResponseBody body;

    private GetPosChEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPosChEcomResponse create() {
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
    public GetPosChEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPosChEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPosChEcomResponseBody body);

        @Override
        GetPosChEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPosChEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPosChEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPosChEcomResponse response) {
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
        public Builder body(GetPosChEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPosChEcomResponse build() {
            return new GetPosChEcomResponse(this);
        } 

    } 

}
