/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.ql.ddl.workloadmanagement.mapping.drop;

import java.io.Serializable;

import org.apache.hadoop.hive.ql.ddl.DDLDesc;
import org.apache.hadoop.hive.ql.plan.Explain;
import org.apache.hadoop.hive.ql.plan.Explain.Level;

/**
 * DDL task description for DROP ... MAPPING commands.
 */
@Explain(displayName = "Drop mapping", explainLevels = { Level.USER, Level.DEFAULT, Level.EXTENDED })
public class DropWMMappingDesc implements DDLDesc, Serializable {
  private static final long serialVersionUID = 1L;

  private final String resourcePlanName;
  private final String entityType;
  private final String entityName;

  public DropWMMappingDesc(String resourcePlanName, String entityType, String entityName) {
    this.resourcePlanName = resourcePlanName;
    this.entityType = entityType;
    this.entityName = entityName;
  }

  @Explain(displayName = "Resource plan name", explainLevels = { Level.USER, Level.DEFAULT, Level.EXTENDED })
  public String getResourcePlanName() {
    return resourcePlanName;
  }

  @Explain(displayName = "Entity type", explainLevels = { Level.USER, Level.DEFAULT, Level.EXTENDED })
  public String getEntityType() {
    return entityType;
  }

  @Explain(displayName = "Entity name", explainLevels = { Level.USER, Level.DEFAULT, Level.EXTENDED })
  public String getEntityName() {
    return entityName;
  }
}
