// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeEduPaperCutResponse} extends {@link TeaModel}
 *
 * <p>RecognizeEduPaperCutResponse</p>
 */
public class RecognizeEduPaperCutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeEduPaperCutResponseBody body;

    private RecognizeEduPaperCutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeEduPaperCutResponse create() {
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
    public RecognizeEduPaperCutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeEduPaperCutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeEduPaperCutResponseBody body);

        @Override
        RecognizeEduPaperCutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeEduPaperCutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeEduPaperCutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeEduPaperCutResponse response) {
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
        public Builder body(RecognizeEduPaperCutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeEduPaperCutResponse build() {
            return new RecognizeEduPaperCutResponse(this);
        } 

    } 

}
