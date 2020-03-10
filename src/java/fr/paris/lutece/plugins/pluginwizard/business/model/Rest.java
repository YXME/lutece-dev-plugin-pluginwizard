/*
 * Copyright (c) 2002-2014, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.pluginwizard.business.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the business class for the object Rest
 */
public class Rest implements Serializable
{
    // Variables declarations
    private int _nId;
    private List<Integer> _nIdBusinessClasses;

    /**
     * Returns the Id
     * 
     * @return The Id
     */
    public int getId( )
    {
        return _nId;
    }

    /**
     * Sets the Id
     * 
     * @param nId
     *            The Id
     */
    public void setId( int nId )
    {
        _nId = nId;
    }

    /**
     * Returns the list of IdBusinessClasses
     * 
     * @return the collection of IdBusinessClasses
     */
    public List<Integer> getIdBusinessClasses( )
    {
        if ( _nIdBusinessClasses != null ) 
        {
            return ( List<Integer> )( ( ( ArrayList<Integer> )_nIdBusinessClasses ).clone( ) );
        }
        else
        {
            return null;
        }
    }

    /**
     * Sets the list of IdBusinessClasses
     * 
     * @param nIdBusinessClasses
     *            The collection of IdBusinessClasses
     */
    public void setIdBusinessClasses( List<Integer> nIdBusinessClasses )
    {
        if ( nIdBusinessClasses != null ) 
        {
            _nIdBusinessClasses = ( List<Integer> )( ( ( ArrayList<Integer> )nIdBusinessClasses ).clone( ) );
        }
        else
        {
            _nIdBusinessClasses = null;
        }
    }
}
