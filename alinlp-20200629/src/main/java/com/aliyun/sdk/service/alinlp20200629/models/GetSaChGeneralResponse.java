// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSaChGeneralResponse} extends {@link TeaModel}
 *
 * <p>GetSaChGeneralResponse</p>
 */
public class GetSaChGeneralResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSaChGeneralResponseBody body;

    private GetSaChGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSaChGeneralResponse create() {
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
    public GetSaChGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSaChGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSaChGeneralResponseBody body);

        @Override
        GetSaChGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSaChGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSaChGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSaChGeneralResponse response) {
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
        public Builder body(GetSaChGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSaChGeneralResponse build() {
            return new GetSaChGeneralResponse(this);
        } 

    } 

}
