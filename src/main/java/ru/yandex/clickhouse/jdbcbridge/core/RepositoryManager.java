/**
 * Copyright 2019-2021, Zhichun Wu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.yandex.clickhouse.jdbcbridge.core;

import java.util.List;

/**
 * This interface defines a service for managing entities like
 * {@link NamedDataSource}, {@link NamedSchema}, and {@link NamedQuery}.
 * 
 * @since 2.0
 */
public interface RepositoryManager {
    /**
     * Get repository capable of managing given type of entity.
     * 
     * @param <T>   type of entity to be managed
     * @param clazz class of entity
     * @return repository capable of managing given type of entity
     */
    <T extends ManagedEntity> Repository<T> getRepository(Class<T> clazz);

    /**
     * Update repository list using given repositories.
     * 
     * @param repos repositories
     */
    void update(List<Repository<?>> repos);
}
