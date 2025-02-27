// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOtaTaskByTaskIdRequest} extends {@link RequestModel}
 *
 * <p>GetOtaTaskByTaskIdRequest</p>
 */
public class GetOtaTaskByTaskIdRequest extends Request {
    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private GetOtaTaskByTaskIdRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOtaTaskByTaskIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetOtaTaskByTaskIdRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetOtaTaskByTaskIdRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * ota任务id
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetOtaTaskByTaskIdRequest build() {
            return new GetOtaTaskByTaskIdRequest(this);
        } 

    } 

}
