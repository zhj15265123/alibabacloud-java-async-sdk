// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcBindingsRequest} extends {@link RequestModel}
 *
 * <p>ListVpcBindingsRequest</p>
 */
public class ListVpcBindingsRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    private ListVpcBindingsRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcBindingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    public static final class Builder extends Request.Builder<ListVpcBindingsRequest, Builder> {
        private String functionName; 

        private Builder() {
            super();
        } 

        private Builder(ListVpcBindingsRequest request) {
            super(request);
            this.functionName = request.functionName;
        } 

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        @Override
        public ListVpcBindingsRequest build() {
            return new ListVpcBindingsRequest(this);
        } 

    } 

}
