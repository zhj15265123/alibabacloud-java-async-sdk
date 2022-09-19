// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableHoneypotRequest} extends {@link RequestModel}
 *
 * <p>ListAvailableHoneypotRequest</p>
 */
public class ListAvailableHoneypotRequest extends Request {
    @Query
    @NameInMap("NodeId")
    private String nodeId;

    private ListAvailableHoneypotRequest(Builder builder) {
        super(builder);
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableHoneypotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<ListAvailableHoneypotRequest, Builder> {
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(ListAvailableHoneypotRequest request) {
            super(request);
            this.nodeId = request.nodeId;
        } 

        /**
         * 蜜罐管理节点唯一ID
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public ListAvailableHoneypotRequest build() {
            return new ListAvailableHoneypotRequest(this);
        } 

    } 

}
