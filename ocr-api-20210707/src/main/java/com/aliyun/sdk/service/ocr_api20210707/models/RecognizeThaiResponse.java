// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeThaiResponse} extends {@link TeaModel}
 *
 * <p>RecognizeThaiResponse</p>
 */
public class RecognizeThaiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeThaiResponseBody body;

    private RecognizeThaiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeThaiResponse create() {
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
    public RecognizeThaiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeThaiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeThaiResponseBody body);

        @Override
        RecognizeThaiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeThaiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeThaiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeThaiResponse response) {
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
        public Builder body(RecognizeThaiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeThaiResponse build() {
            return new RecognizeThaiResponse(this);
        } 

    } 

}
