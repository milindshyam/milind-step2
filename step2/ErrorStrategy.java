class ErrorStrategy extends DefaultErrorStrategy
{
	@Override
	public void reportError(Parser recognizer, RecognitionException ex)
	{
		throw ex;
	}	
}