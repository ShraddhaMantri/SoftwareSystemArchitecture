package abstractfactory;

import strategypattern.CancelMsg;
import strategypattern.DisplayMenu;
import strategypattern.GasPumpedMsg;
import strategypattern.PayMsg;
import strategypattern.PrintReceipt;
import strategypattern.PumpGasUnit;
import strategypattern.ReadyMsg;
import strategypattern.RejectMsg;
import strategypattern.ReturnCash;
import strategypattern.SetInitialValues;
import strategypattern.SetPrice;
import strategypattern.StopMsg;
import strategypattern.StoreCash;
import strategypattern.StoreData;

/**
 * @author shraddha
 *
 */

public interface AbstractFactory {
	public StoreData getStoreData();
	public DisplayMenu getDisplayMenu();
	public PayMsg getPayMsg();
	public SetPrice getSetPrice();
	public SetInitialValues getSetInitialValues();
	public PumpGasUnit getPumpGasUnit();
	public PrintReceipt getPrintReceipt();
	public StopMsg getStopMsg();
	public RejectMsg getRejectMsg();
	public CancelMsg getCancelMsg();
	public ReadyMsg getReadyMsg();
	public GasPumpedMsg getGasPumpedMsg();
	public StoreCash getStoreCash();
	public ReturnCash getReturnCash(); 
}
