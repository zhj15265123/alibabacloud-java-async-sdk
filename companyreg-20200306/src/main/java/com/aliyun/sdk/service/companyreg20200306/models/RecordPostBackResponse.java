// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecordPostBackResponse} extends {@link TeaModel}
 *
 * <p>RecordPostBackResponse</p>
 */
public class RecordPostBackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecordPostBackResponseBody body;

    private RecordPostBackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecordPostBackResponse create() {
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
    public RecordPostBackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecordPostBackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecordPostBackResponseBody body);

        @Override
        RecordPostBackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecordPostBackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecordPostBackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecordPostBackResponse response) {
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
        public Builder body(RecordPostBackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecordPostBackResponse build() {
            return new RecordPostBackResponse(this);
        } 

    } 

}
