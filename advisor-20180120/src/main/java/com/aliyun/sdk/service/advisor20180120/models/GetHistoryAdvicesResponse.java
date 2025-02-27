// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoryAdvicesResponse} extends {@link TeaModel}
 *
 * <p>GetHistoryAdvicesResponse</p>
 */
public class GetHistoryAdvicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHistoryAdvicesResponseBody body;

    private GetHistoryAdvicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHistoryAdvicesResponse create() {
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
    public GetHistoryAdvicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHistoryAdvicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHistoryAdvicesResponseBody body);

        @Override
        GetHistoryAdvicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHistoryAdvicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHistoryAdvicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHistoryAdvicesResponse response) {
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
        public Builder body(GetHistoryAdvicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHistoryAdvicesResponse build() {
            return new GetHistoryAdvicesResponse(this);
        } 

    } 

}
