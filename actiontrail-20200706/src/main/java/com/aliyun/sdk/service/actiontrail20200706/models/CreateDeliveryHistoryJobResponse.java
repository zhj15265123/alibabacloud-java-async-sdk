// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeliveryHistoryJobResponse} extends {@link TeaModel}
 *
 * <p>CreateDeliveryHistoryJobResponse</p>
 */
public class CreateDeliveryHistoryJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDeliveryHistoryJobResponseBody body;

    private CreateDeliveryHistoryJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDeliveryHistoryJobResponse create() {
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
    public CreateDeliveryHistoryJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeliveryHistoryJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDeliveryHistoryJobResponseBody body);

        @Override
        CreateDeliveryHistoryJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeliveryHistoryJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDeliveryHistoryJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeliveryHistoryJobResponse response) {
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
        public Builder body(CreateDeliveryHistoryJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeliveryHistoryJobResponse build() {
            return new CreateDeliveryHistoryJobResponse(this);
        } 

    } 

}
