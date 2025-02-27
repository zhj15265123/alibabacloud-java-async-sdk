// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUdfFileRequest} extends {@link RequestModel}
 *
 * <p>CreateUdfFileRequest</p>
 */
public class CreateUdfFileRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("ClassName")
    @Validation(required = true)
    private String className;

    @Body
    @NameInMap("CmdDescription")
    private String cmdDescription;

    @Body
    @NameInMap("CreateFolderIfNotExists")
    private Boolean createFolderIfNotExists;

    @Body
    @NameInMap("Example")
    private String example;

    @Body
    @NameInMap("FileFolderPath")
    private String fileFolderPath;

    @Body
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Body
    @NameInMap("FunctionType")
    @Validation(required = true)
    private String functionType;

    @Body
    @NameInMap("ParameterDescription")
    private String parameterDescription;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @Body
    @NameInMap("Resources")
    @Validation(required = true)
    private String resources;

    @Body
    @NameInMap("ReturnValue")
    private String returnValue;

    @Body
    @NameInMap("UdfDescription")
    private String udfDescription;

    private CreateUdfFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.className = builder.className;
        this.cmdDescription = builder.cmdDescription;
        this.createFolderIfNotExists = builder.createFolderIfNotExists;
        this.example = builder.example;
        this.fileFolderPath = builder.fileFolderPath;
        this.fileName = builder.fileName;
        this.functionType = builder.functionType;
        this.parameterDescription = builder.parameterDescription;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.resources = builder.resources;
        this.returnValue = builder.returnValue;
        this.udfDescription = builder.udfDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUdfFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return cmdDescription
     */
    public String getCmdDescription() {
        return this.cmdDescription;
    }

    /**
     * @return createFolderIfNotExists
     */
    public Boolean getCreateFolderIfNotExists() {
        return this.createFolderIfNotExists;
    }

    /**
     * @return example
     */
    public String getExample() {
        return this.example;
    }

    /**
     * @return fileFolderPath
     */
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
    }

    /**
     * @return parameterDescription
     */
    public String getParameterDescription() {
        return this.parameterDescription;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectIdentifier
     */
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    /**
     * @return returnValue
     */
    public String getReturnValue() {
        return this.returnValue;
    }

    /**
     * @return udfDescription
     */
    public String getUdfDescription() {
        return this.udfDescription;
    }

    public static final class Builder extends Request.Builder<CreateUdfFileRequest, Builder> {
        private String regionId; 
        private String className; 
        private String cmdDescription; 
        private Boolean createFolderIfNotExists; 
        private String example; 
        private String fileFolderPath; 
        private String fileName; 
        private String functionType; 
        private String parameterDescription; 
        private Long projectId; 
        private String projectIdentifier; 
        private String resources; 
        private String returnValue; 
        private String udfDescription; 

        private Builder() {
            super();
        } 

        private Builder(CreateUdfFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.className = request.className;
            this.cmdDescription = request.cmdDescription;
            this.createFolderIfNotExists = request.createFolderIfNotExists;
            this.example = request.example;
            this.fileFolderPath = request.fileFolderPath;
            this.fileName = request.fileName;
            this.functionType = request.functionType;
            this.parameterDescription = request.parameterDescription;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.resources = request.resources;
            this.returnValue = request.returnValue;
            this.udfDescription = request.udfDescription;
        } 

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the class in which the function is defined. This parameter corresponds to the Class Name parameter in the Register Function section of the configuration tab of the function in the DataWorks console.
         */
        public Builder className(String className) {
            this.putBodyParameter("ClassName", className);
            this.className = className;
            return this;
        }

        /**
         * The syntax used for calling the function. This parameter corresponds to the Expression Syntax parameter in the Register Function section of the configuration tab of the function in the DataWorks console.
         */
        public Builder cmdDescription(String cmdDescription) {
            this.putBodyParameter("CmdDescription", cmdDescription);
            this.cmdDescription = cmdDescription;
            return this;
        }

        /**
         * CreateFolderIfNotExists.
         */
        public Builder createFolderIfNotExists(Boolean createFolderIfNotExists) {
            this.putBodyParameter("CreateFolderIfNotExists", createFolderIfNotExists);
            this.createFolderIfNotExists = createFolderIfNotExists;
            return this;
        }

        /**
         * The example for calling the function. This parameter corresponds to the Example parameter in the Register Function section of the configuration tab of the function in the DataWorks console.
         */
        public Builder example(String example) {
            this.putBodyParameter("Example", example);
            this.example = example;
            return this;
        }

        /**
         * The path of the folder in which the file for the function is stored.
         */
        public Builder fileFolderPath(String fileFolderPath) {
            this.putBodyParameter("FileFolderPath", fileFolderPath);
            this.fileFolderPath = fileFolderPath;
            return this;
        }

        /**
         * The name of the file for the function.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * The type of the function. Valid values: MATH, AGGREGATE, STRING, DATE, ANALYTIC, and OTHER. This parameter corresponds to the Function Type parameter in the Register Function section of the configuration tab of the function in the DataWorks console.
         */
        public Builder functionType(String functionType) {
            this.putBodyParameter("FunctionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * The description of the input parameters of the function. This parameter corresponds to the Parameter Description parameter in the Register Function section of the configuration tab of the function in the DataWorks console.
         */
        public Builder parameterDescription(String parameterDescription) {
            this.putBodyParameter("ParameterDescription", parameterDescription);
            this.parameterDescription = parameterDescription;
            return this;
        }

        /**
         * The ID of the DataWorks workspace. You can click the Workspace Manage icon in the upper-right corner of the DataStudio page to go to the Workspace Management page and view the workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The unique identifier of the DataWorks workspace. You can click the identifier in the upper-left corner of the DataStudio page to switch to another workspace.
         * <p>
         * 
         * You must specify either this parameter or the projectId parameter to determine the DataWorks workspace to which the operation is called.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * The names of the resources that are referenced by the function. This parameter corresponds to the Resources parameter in the Register Function section of the configuration tab of the function in the DataWorks console. Multiple resource names are separated by commas (,).
         */
        public Builder resources(String resources) {
            this.putBodyParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * The description of the return value of the function. This parameter corresponds to the Return Value parameter in the Register Function section of the configuration tab of the function in the DataWorks console.
         */
        public Builder returnValue(String returnValue) {
            this.putBodyParameter("ReturnValue", returnValue);
            this.returnValue = returnValue;
            return this;
        }

        /**
         * The description of the function. This parameter corresponds to the Description parameter in the Register Function section of the configuration tab of the function in the DataWorks console.
         */
        public Builder udfDescription(String udfDescription) {
            this.putBodyParameter("UdfDescription", udfDescription);
            this.udfDescription = udfDescription;
            return this;
        }

        @Override
        public CreateUdfFileRequest build() {
            return new CreateUdfFileRequest(this);
        } 

    } 

}
