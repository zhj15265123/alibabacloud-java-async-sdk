// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmItemsRequest} extends {@link RequestModel}
 *
 * <p>ListAlarmItemsRequest</p>
 */
public class ListAlarmItemsRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    private ListAlarmItemsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<ListAlarmItemsRequest, Builder> {
        private String acceptLanguage; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(ListAlarmItemsRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.requestPars = response.requestPars;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * RequestPars.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        @Override
        public ListAlarmItemsRequest build() {
            return new ListAlarmItemsRequest(this);
        } 

    } 

}
