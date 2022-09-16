// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountSpeechBroadcastHourResponse} extends {@link TeaModel}
 *
 * <p>CountSpeechBroadcastHourResponse</p>
 */
public class CountSpeechBroadcastHourResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CountSpeechBroadcastHourResponseBody body;

    private CountSpeechBroadcastHourResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CountSpeechBroadcastHourResponse create() {
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
    public CountSpeechBroadcastHourResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CountSpeechBroadcastHourResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CountSpeechBroadcastHourResponseBody body);

        @Override
        CountSpeechBroadcastHourResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CountSpeechBroadcastHourResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CountSpeechBroadcastHourResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CountSpeechBroadcastHourResponse response) {
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
        public Builder body(CountSpeechBroadcastHourResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CountSpeechBroadcastHourResponse build() {
            return new CountSpeechBroadcastHourResponse(this);
        } 

    } 

}
