// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGroupMonitoringAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>DeleteGroupMonitoringAgentProcessRequest</p>
 */
public class DeleteGroupMonitoringAgentProcessRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DeleteGroupMonitoringAgentProcessRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGroupMonitoringAgentProcessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteGroupMonitoringAgentProcessRequest, Builder> {
        private String groupId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGroupMonitoringAgentProcessRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.id = request.id;
        } 

        /**
         * The ID of the process monitoring task.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteGroupMonitoringAgentProcessRequest build() {
            return new DeleteGroupMonitoringAgentProcessRequest(this);
        } 

    } 

}
