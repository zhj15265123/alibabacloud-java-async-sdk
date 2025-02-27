// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrainingJobLogsRequest} extends {@link RequestModel}
 *
 * <p>ListTrainingJobLogsRequest</p>
 */
public class ListTrainingJobLogsRequest extends Request {
    @Path
    @NameInMap("TrainingJobId")
    @Validation(required = true)
    private String trainingJobId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 2000, minimum = 1)
    private Long pageSize;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("WorkerId")
    private String workerId;

    private ListTrainingJobLogsRequest(Builder builder) {
        super(builder);
        this.trainingJobId = builder.trainingJobId;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.workerId = builder.workerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrainingJobLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return workerId
     */
    public String getWorkerId() {
        return this.workerId;
    }

    public static final class Builder extends Request.Builder<ListTrainingJobLogsRequest, Builder> {
        private String trainingJobId; 
        private String endTime; 
        private Long pageNumber; 
        private Long pageSize; 
        private String startTime; 
        private String workerId; 

        private Builder() {
            super();
        } 

        private Builder(ListTrainingJobLogsRequest request) {
            super(request);
            this.trainingJobId = request.trainingJobId;
            this.endTime = request.endTime;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.workerId = request.workerId;
        } 

        /**
         * TrainingJobId.
         */
        public Builder trainingJobId(String trainingJobId) {
            this.putPathParameter("TrainingJobId", trainingJobId);
            this.trainingJobId = trainingJobId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * WorkerId.
         */
        public Builder workerId(String workerId) {
            this.putQueryParameter("WorkerId", workerId);
            this.workerId = workerId;
            return this;
        }

        @Override
        public ListTrainingJobLogsRequest build() {
            return new ListTrainingJobLogsRequest(this);
        } 

    } 

}
