// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmHistoriesResponse} extends {@link TeaModel}
 *
 * <p>ListAlarmHistoriesResponse</p>
 */
public class ListAlarmHistoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAlarmHistoriesResponseBody body;

    private ListAlarmHistoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAlarmHistoriesResponse create() {
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
    public ListAlarmHistoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAlarmHistoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAlarmHistoriesResponseBody body);

        @Override
        ListAlarmHistoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAlarmHistoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAlarmHistoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAlarmHistoriesResponse response) {
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
        public Builder body(ListAlarmHistoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAlarmHistoriesResponse build() {
            return new ListAlarmHistoriesResponse(this);
        } 

    } 

}
