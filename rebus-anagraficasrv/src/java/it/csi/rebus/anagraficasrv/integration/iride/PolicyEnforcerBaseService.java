/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
/**
 * PolicyEnforcerBaseService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 13, 2013 (09:13:21 GMT) WSDL2Java emitter.
 */

package it.csi.rebus.anagraficasrv.integration.iride;

public interface PolicyEnforcerBaseService extends java.rmi.Remote {
    public it.csi.rebus.anagraficasrv.integration.iride.Identita identificaUserPassword(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.AuthException, it.csi.rebus.anagraficasrv.integration.iride.MalformedUsernameException, it.csi.rebus.anagraficasrv.integration.iride.IdProviderNotFoundException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public it.csi.rebus.anagraficasrv.integration.iride.Identita identificaCertificato(byte[] in0) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.CertRevokedException, it.csi.rebus.anagraficasrv.integration.iride.IdProviderNotFoundException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.CertOutsideValidityException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public it.csi.rebus.anagraficasrv.integration.iride.Identita identificaUserPasswordPIN(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.AuthException, it.csi.rebus.anagraficasrv.integration.iride.MalformedUsernameException, it.csi.rebus.anagraficasrv.integration.iride.IdProviderNotFoundException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public boolean isPersonaAutorizzataInUseCase(it.csi.rebus.anagraficasrv.integration.iride.Identita in0, it.csi.rebus.anagraficasrv.integration.iride.UseCase in1) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.NoSuchUseCaseException, it.csi.rebus.anagraficasrv.integration.iride.NoSuchApplicationException, it.csi.rebus.anagraficasrv.integration.iride.IdentitaNonAutenticaException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public it.csi.rebus.anagraficasrv.integration.iride.UseCase[] findUseCasesForPersonaInApplication(it.csi.rebus.anagraficasrv.integration.iride.Identita in0, it.csi.rebus.anagraficasrv.integration.iride.Application in1) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.NoSuchApplicationException, it.csi.rebus.anagraficasrv.integration.iride.IdentitaNonAutenticaException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public boolean isIdentitaAutentica(it.csi.rebus.anagraficasrv.integration.iride.Identita in0) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public java.lang.String getInfoPersonaInUseCase(it.csi.rebus.anagraficasrv.integration.iride.Identita in0, it.csi.rebus.anagraficasrv.integration.iride.UseCase in1) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.NoSuchUseCaseException, it.csi.rebus.anagraficasrv.integration.iride.NoSuchApplicationException, it.csi.rebus.anagraficasrv.integration.iride.IdentitaNonAutenticaException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public it.csi.rebus.anagraficasrv.integration.iride.Ruolo[] findRuoliForPersonaInUseCase(it.csi.rebus.anagraficasrv.integration.iride.Identita in0, it.csi.rebus.anagraficasrv.integration.iride.UseCase in1) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.NoSuchUseCaseException, it.csi.rebus.anagraficasrv.integration.iride.NoSuchApplicationException, it.csi.rebus.anagraficasrv.integration.iride.IdentitaNonAutenticaException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public it.csi.rebus.anagraficasrv.integration.iride.Ruolo[] findRuoliForPersonaInApplication(it.csi.rebus.anagraficasrv.integration.iride.Identita in0, it.csi.rebus.anagraficasrv.integration.iride.Application in1) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.NoSuchApplicationException, it.csi.rebus.anagraficasrv.integration.iride.IdentitaNonAutenticaException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public java.lang.String getInfoPersonaSchema(it.csi.rebus.anagraficasrv.integration.iride.Ruolo in0) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.BadRuoloException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public it.csi.rebus.anagraficasrv.integration.iride.Actor[] findActorsForPersonaInApplication(it.csi.rebus.anagraficasrv.integration.iride.Identita in0, it.csi.rebus.anagraficasrv.integration.iride.Application in1) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.NoSuchApplicationException, it.csi.rebus.anagraficasrv.integration.iride.IdentitaNonAutenticaException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public it.csi.rebus.anagraficasrv.integration.iride.Actor[] findActorsForPersonaInUseCase(it.csi.rebus.anagraficasrv.integration.iride.Identita in0, it.csi.rebus.anagraficasrv.integration.iride.UseCase in1) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.NoSuchUseCaseException, it.csi.rebus.anagraficasrv.integration.iride.NoSuchApplicationException, it.csi.rebus.anagraficasrv.integration.iride.IdentitaNonAutenticaException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
    public boolean isPersonaInRuolo(it.csi.rebus.anagraficasrv.integration.iride.Identita in0, it.csi.rebus.anagraficasrv.integration.iride.Ruolo in1) throws java.rmi.RemoteException, it.csi.rebus.anagraficasrv.integration.iride.SystemException, it.csi.rebus.anagraficasrv.integration.iride.BadRuoloException, it.csi.rebus.anagraficasrv.integration.iride.IdentitaNonAutenticaException, it.csi.rebus.anagraficasrv.integration.iride.InternalException, it.csi.rebus.anagraficasrv.integration.iride.UnrecoverableException;
}
