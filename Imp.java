public class Imp {
	public static void main(String args[]) {
		Object o1 = new Object();
		Object o2 = new Object();

		New n = new New();

        try {
            is = request.getInputStream();
            fos = new FileOutputStream(new File(realPath + n.doPost(o1, o2)));
            IOUtils.copy(is, fos);
            response.setStatus(response.SC_OK);
            writer.print("{success: true}");
        } catch (FileNotFoundException ex) {
            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            log(OctetStreamReader.class.getName() + "has thrown an exception: " + ex.getMessage());
        } catch (IOException ex) {
            response.setStatus(response.SC_INTERNAL_SERVER_ERROR);
            writer.print("{success: false}");
            log(OctetStreamReader.class.getName() + "has thrown an exception: " + ex.getMessage());
        } finally {
            try {
                fos.close();
                is.close();
            } catch (IOException ignored) {
            }
        }

        writer.flush();
        writer.close();
	}
}
