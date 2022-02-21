// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamBitRateDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamBitRateDataResponse</p>
 */
public class DescribeLiveStreamBitRateDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveStreamBitRateDataResponseBody body;

    private DescribeLiveStreamBitRateDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveStreamBitRateDataResponse create() {
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
    public DescribeLiveStreamBitRateDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveStreamBitRateDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveStreamBitRateDataResponseBody body);

        @Override
        DescribeLiveStreamBitRateDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveStreamBitRateDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveStreamBitRateDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveStreamBitRateDataResponse response) {
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
        public Builder body(DescribeLiveStreamBitRateDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveStreamBitRateDataResponse build() {
            return new DescribeLiveStreamBitRateDataResponse(this);
        } 

    } 

}
