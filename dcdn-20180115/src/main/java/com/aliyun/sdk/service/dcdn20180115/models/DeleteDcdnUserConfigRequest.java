// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnUserConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteDcdnUserConfigRequest</p>
 */
public class DeleteDcdnUserConfigRequest extends Request {
    @Query
    @NameInMap("FunctionName")
    private String functionName;

    private DeleteDcdnUserConfigRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnUserConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDcdnUserConfigRequest, Builder> {
        private String functionName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDcdnUserConfigRequest request) {
            super(request);
            this.functionName = request.functionName;
        } 

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        @Override
        public DeleteDcdnUserConfigRequest build() {
            return new DeleteDcdnUserConfigRequest(this);
        } 

    } 

}
