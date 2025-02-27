// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWsCustomizedSeaEcomResponse} extends {@link TeaModel}
 *
 * <p>GetWsCustomizedSeaEcomResponse</p>
 */
public class GetWsCustomizedSeaEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWsCustomizedSeaEcomResponseBody body;

    private GetWsCustomizedSeaEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWsCustomizedSeaEcomResponse create() {
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
    public GetWsCustomizedSeaEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWsCustomizedSeaEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWsCustomizedSeaEcomResponseBody body);

        @Override
        GetWsCustomizedSeaEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWsCustomizedSeaEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWsCustomizedSeaEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWsCustomizedSeaEcomResponse response) {
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
        public Builder body(GetWsCustomizedSeaEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWsCustomizedSeaEcomResponse build() {
            return new GetWsCustomizedSeaEcomResponse(this);
        } 

    } 

}
