/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Arbalo AG
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.opentdc.users.opencrx;

import java.util.List;
import java.util.logging.Logger;

import javax.naming.NamingException;
import javax.servlet.ServletContext;

import org.openmdx.base.exception.ServiceException;
import org.opentdc.opencrx.AbstractOpencrxServiceProvider;
import org.opentdc.service.exception.*;
import org.opentdc.users.ServiceProvider;
import org.opentdc.users.UserModel;

public class OpencrxServiceProvider extends AbstractOpencrxServiceProvider implements ServiceProvider {

	private static final Logger logger = Logger.getLogger(OpencrxServiceProvider.class.getName());

	public OpencrxServiceProvider(
		ServletContext context, 
		String prefix
	) throws ServiceException, NamingException {
		super(context, prefix);
	}
	
	@Override
	public List<UserModel> list(
		String query,
		String queryType,
		long position,
		long size
	) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel create(
			UserModel user) 
			throws DuplicateException, ValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel read(
			String id) 
			throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel update(
			String id, 
			UserModel user) 
			throws NotFoundException, ValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(
			String id) 
			throws NotFoundException, InternalServerErrorException {
		// TODO Auto-generated method stub
		
	}
}
