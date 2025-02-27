// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNerCustomizedChEcomResponse} extends {@link TeaModel}
 *
 * <p>GetNerCustomizedChEcomResponse</p>
 */
public class GetNerCustomizedChEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNerCustomizedChEcomResponseBody body;

    private GetNerCustomizedChEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNerCustomizedChEcomResponse create() {
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
    public GetNerCustomizedChEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNerCustomizedChEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNerCustomizedChEcomResponseBody body);

        @Override
        GetNerCustomizedChEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNerCustomizedChEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNerCustomizedChEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNerCustomizedChEcomResponse response) {
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
        public Builder body(GetNerCustomizedChEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNerCustomizedChEcomResponse build() {
            return new GetNerCustomizedChEcomResponse(this);
        } 

    } 

}
