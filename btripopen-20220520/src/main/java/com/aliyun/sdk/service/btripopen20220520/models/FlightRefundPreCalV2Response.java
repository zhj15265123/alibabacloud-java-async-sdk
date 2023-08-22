// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightRefundPreCalV2Response} extends {@link TeaModel}
 *
 * <p>FlightRefundPreCalV2Response</p>
 */
public class FlightRefundPreCalV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FlightRefundPreCalV2ResponseBody body;

    private FlightRefundPreCalV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FlightRefundPreCalV2Response create() {
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
    public FlightRefundPreCalV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FlightRefundPreCalV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FlightRefundPreCalV2ResponseBody body);

        @Override
        FlightRefundPreCalV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FlightRefundPreCalV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FlightRefundPreCalV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FlightRefundPreCalV2Response response) {
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
        public Builder body(FlightRefundPreCalV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FlightRefundPreCalV2Response build() {
            return new FlightRefundPreCalV2Response(this);
        } 

    } 

}
