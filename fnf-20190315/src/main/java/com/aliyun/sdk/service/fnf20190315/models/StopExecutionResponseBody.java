// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>StopExecutionResponseBody</p>
 */
public class StopExecutionResponseBody extends TeaModel {
    @NameInMap("FlowDefinition")
    private String flowDefinition;

    @NameInMap("FlowName")
    private String flowName;

    @NameInMap("Input")
    private String input;

    @NameInMap("Name")
    private String name;

    @NameInMap("Output")
    private String output;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartedTime")
    private String startedTime;

    @NameInMap("Status")
    private String status;

    @NameInMap("StoppedTime")
    private String stoppedTime;

    private StopExecutionResponseBody(Builder builder) {
        this.flowDefinition = builder.flowDefinition;
        this.flowName = builder.flowName;
        this.input = builder.input;
        this.name = builder.name;
        this.output = builder.output;
        this.requestId = builder.requestId;
        this.startedTime = builder.startedTime;
        this.status = builder.status;
        this.stoppedTime = builder.stoppedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopExecutionResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowDefinition
     */
    public String getFlowDefinition() {
        return this.flowDefinition;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startedTime
     */
    public String getStartedTime() {
        return this.startedTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stoppedTime
     */
    public String getStoppedTime() {
        return this.stoppedTime;
    }

    public static final class Builder {
        private String flowDefinition; 
        private String flowName; 
        private String input; 
        private String name; 
        private String output; 
        private String requestId; 
        private String startedTime; 
        private String status; 
        private String stoppedTime; 

        /**
         * The definition of the flow.
         */
        public Builder flowDefinition(String flowDefinition) {
            this.flowDefinition = flowDefinition;
            return this;
        }

        /**
         * The name of the flow.
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
            return this;
        }

        /**
         * The input of the execution, which is in the JSON format.
         */
        public Builder input(String input) {
            this.input = input;
            return this;
        }

        /**
         * The name of the execution.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The execution result, which is in the JSON format.
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the execution started.
         */
        public Builder startedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }

        /**
         * The execution state. Valid values:
         * <p>
         * 
         * *   **Running**
         * *   **Stopped**
         * *   **Succeeded**
         * *   **Failed**
         * *   **TimedOut**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The time when the execution stopped.
         */
        public Builder stoppedTime(String stoppedTime) {
            this.stoppedTime = stoppedTime;
            return this;
        }

        public StopExecutionResponseBody build() {
            return new StopExecutionResponseBody(this);
        } 

    } 

}
