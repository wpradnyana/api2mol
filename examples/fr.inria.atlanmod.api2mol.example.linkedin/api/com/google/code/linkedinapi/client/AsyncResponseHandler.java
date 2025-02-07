/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.google.code.linkedinapi.client;

import java.util.concurrent.Future;

import com.google.code.linkedinapi.schema.SchemaEntity;

/**
 * The Abstract class AsyncResponseHandler.
 *
 * @author nmukhtar
 *
 * @param <T>
 */
public abstract class AsyncResponseHandler<T extends SchemaEntity> {
	
	private Future<T> future;
	
    /**
     * Set future
     *
     * @param future the future
     */
	public void setFuture(Future<T> future) {
		this.future = future;
	}
	
    /**
     * Get a reference to the future.
     *
     */
	public Future<T> getFuture() {
		return future;
	}

    /**
     * Handle response.
     *
     * @param response the response
     */
    public abstract void handleResponse(T response);
}
