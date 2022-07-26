// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainOrderQueryResponse} extends {@link TeaModel}
 *
 * <p>TrainOrderQueryResponse</p>
 */
public class TrainOrderQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TrainOrderQueryResponseBody body;

    private TrainOrderQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TrainOrderQueryResponse create() {
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
    public TrainOrderQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TrainOrderQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TrainOrderQueryResponseBody body);

        @Override
        TrainOrderQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TrainOrderQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TrainOrderQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TrainOrderQueryResponse response) {
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
        public Builder body(TrainOrderQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TrainOrderQueryResponse build() {
            return new TrainOrderQueryResponse(this);
        } 

    } 

}
